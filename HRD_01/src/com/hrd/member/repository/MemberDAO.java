package com.hrd.member.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.hrd.common.connection.ConnectionVO;
import com.hrd.member.domain.MemberDTO;

public class MemberDAO {
	private final ConnectionVO vo;

	public MemberDAO() throws Exception {
		try {
			vo = new ConnectionVO();
			if (vo == null) {
				throw new Exception("not found connection");
			}
		} catch (Exception e) {
			throw e;
		}
	}

	public int getSerialNumber() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		StringBuffer sql = new StringBuffer();
		int result = 0;
		try {
			conn = vo.getConnection();
			sql.append("SELECT LPAD(NVL(MAX(CUSTNO),0)+1,6,'10000') FROM  MEMBER_TBL_01");

			pstmt = conn.prepareStatement(sql.toString());

			sqlDebugg(sql);
			
			rs = pstmt.executeQuery();
			return rs.next() ? rs.getInt(1) : 0;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			vo.close(rs, pstmt, conn);
		}
		return result;
	}

	public int insert(MemberDTO dto) {
		int result = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		StringBuffer sql = new StringBuffer();
		try {
			conn = vo.getConnection();
			
			sql.append("INSERT INTO MEMBER_TBL_01 ");
			sql.append(" VALUES(?,?,?,?,?,?,?)");
			
			pstmt = conn.prepareStatement(sql.toString());
			
			sqlDebugg(sql);
			
			pstmt.setInt(1, dto.getCustno());
			pstmt.setString(2,dto.getCustname());
			pstmt.setString(3,dto.getPhone());
			pstmt.setString(4,dto.getAddress());
			pstmt.setString(5,dto.getJoindate()); 
			pstmt.setString(6,gradeRollBack(dto.getGrade()));
			pstmt.setString(7,dto.getCity());

			result = pstmt.executeUpdate();


		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			vo.close(pstmt, conn);
		}
		return result;
	}

	public int update(MemberDTO dto) {
		int result = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		StringBuffer sql = new StringBuffer();
		try {
			conn = vo.getConnection();
			sql.append("UPDATE MEMBER_TBL_01 SET  ");
			sql.append("CUSTNAME = ?"); 
			sql.append(", PHONE = ?");
			sql.append(", ADDRESS = ?");
			sql.append(", JOINDATE = ?");
			sql.append(", GRADE = ?");
			sql.append(", CITY = ?");
			sql.append(" WHERE CUSTNO = ?");

			pstmt = conn.prepareStatement(sql.toString());
			
			sqlDebugg(sql);
			
			pstmt.setString(1,dto.getCustname());
			pstmt.setString(2,dto.getPhone());
			pstmt.setString(3,dto.getAddress());
			pstmt.setString(4,dto.getJoindate());
			pstmt.setString(5,gradeRollBack(dto.getGrade()));
			pstmt.setString(6,dto.getCity());
			pstmt.setInt(7, dto.getCustno());

			
			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			vo.close(pstmt, conn);
		}
		return result;
	}
	
	public List<MemberDTO> list(){
		
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		StringBuffer sql = new StringBuffer();

		try {
			conn = vo.getConnection();
			sql.append("SELECT * FROM  MEMBER_TBL_01");
			sql.append(" ORDER BY CUSTNO");

			pstmt = conn.prepareStatement(sql.toString());

			sqlDebugg(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				list.add(new MemberDTO(rs.getInt(1),
									   rs.getString(2),
									   rs.getString(3),
									   rs.getString(4),
									   dateFormat(rs.getString(5)),
									   gradeSetting(rs.getString(6)),
									   rs.getString(7)
						));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			vo.close(rs, pstmt, conn);
		}
		return list;
	}

	
	public MemberDTO read(MemberDTO dto){
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		StringBuffer sql = new StringBuffer();
		
		try {
			conn = vo.getConnection();
			sql.append("SELECT * FROM  MEMBER_TBL_01");
			sql.append(" WHERE CUSTNO = ?");

			pstmt = conn.prepareStatement(sql.toString());
			
			sqlDebugg(sql);
			
			pstmt.setInt(1, dto.getCustno());
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				 String address = rs.getString(4);
				 System.out.println(address);  
				dto = new MemberDTO(rs.getInt(1),
									   rs.getString(2),
									   rs.getString(3),
									  address,
									   dateFormat(rs.getString(5)),
									   gradeSetting(rs.getString(6)),
									   rs.getString(7)
						);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			vo.close(rs, pstmt, conn);
		}
		return dto;
	}

	public int delete(MemberDTO dto){
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		StringBuffer sql = new StringBuffer();
		int result = 0;
		
		try {
			conn = vo.getConnection();
			sql.append("DELETE FROM  MEMBER_TBL_01");
			sql.append(" WHERE CUSTNO = ?");

			pstmt = conn.prepareStatement(sql.toString());
			
			sqlDebugg(sql);
			
			pstmt.setInt(1, dto.getCustno());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			vo.close( pstmt, conn);
		}
		return result;
	}
	
	private String dateFormat(String value) {
		return value.split(" ")[0].replaceAll("\\-", "\\/");
	}
	private void sqlDebugg(StringBuffer sql) {
		System.out.println("sql : " + sql.toString());
	}
	
	private String gradeSetting(String grade) { 
		String result = "";
		switch (grade.charAt(0)) {
		case '1':
			result = "일반회원";
			break;
		case '2':
			result = "우수회원";
			break;
		case '3': 
			result = "VVIP";
			break;
		}
		return result;
	}
	
	private String gradeRollBack(String grade) {
		String result = "";
		switch (grade) {
		case "일반회원":
			result = "1";
			break;
		case "VVIP":
			result = "3";
			break;
		case "우수회원":
			result = "2"; 
			break;
		}
		return result;
	}
}

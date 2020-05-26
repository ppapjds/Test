package test;

import java.util.ArrayList;
import java.util.List;

import com.hrd.member.domain.MemberDTO;
import com.hrd.member.repository.MemberDAO;

public class MainTest {

	public static void main(String[] args)throws Exception {
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = dao.read(new MemberDTO(100001));
		dto.setGrade("2");
		
		dao.update(dto);
		
		dto.setCustno(dto.getCustno()+1);
		dto = dao.read(dto);
		dto.setGrade("3");   	

		dao.update(dto);
	
	}		
}

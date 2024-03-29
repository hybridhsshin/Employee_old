package webapp.dao;

import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import webapp.model.Dept;
import webapp.model.Emp;

@RunWith(SpringJUnit4ClassRunner.class) //Text목적
@ContextConfiguration("classpath:/webapp/spring/beans.xml") // 공장만들어줌
public class DeptDaoTest {
	static Logger log = Logger.getLogger(DeptDaoTest.class);
	
	@Autowired
	ApplicationContext factory;//자동으로 넣어줌
	
	@Test
	public void testSelectByDeptno() throws SQLException {
		DeptDao dao = factory.getBean(DeptDao.class);
	
		Dept dept = dao.selectByDeptno(10);
		assertNotNull(dept);
		
		log.info("deptno = "+ dept.getDeptno());
		log.info("dname = "+ dept.getDname());
		log.info("loc = "+ dept.getLoc());
	}
	
	@Test
	public void testSelectByWithDeptnoWithEmps() throws SQLException {
		DeptDao dao = factory.getBean(DeptDao.class);
	
		Dept dept = dao.selectByDeptno(10);
		
		assertNotNull(dept);
		
		log.info("deptno = "+ dept.getDeptno());
		log.info("dname = "+ dept.getDname());
		log.info("loc = "+ dept.getLoc());
		
		if(dept.getEmps() !=null)
		for(Emp e : dept.getEmps()){
			log.info(e.getEmpno() + " "+e.getEname());
		}
			
	}
	

}

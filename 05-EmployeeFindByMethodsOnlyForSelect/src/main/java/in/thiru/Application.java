package in.thiru;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.thiru.service.EmployeeService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		
		EmployeeService service = run.getBean(EmployeeService.class);
		
		
		//findBy	==>	  methods	[findBy,getBy,readBy,queryBy][we can perform only select opertions
		//=======================================================
		
		service.getEmpName("JEEVAN");
		
		
		//service.getByEmpDeptName("Sales");
		
		
		//service.getByEmpNameAndEmpDept("jhon", "Sales");
		
		//service.getSalGreater(19000.00);
		
		
		
		
		//custome queries
		//===============
		
		//service.getById(101);
		//service.getAllEmps();
		
		
		
		
		
	}

}

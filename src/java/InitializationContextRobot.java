
import ChatRobot.Robot;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Web application lifecycle listener.
 *
 * @author Lenovo
 */
public class InitializationContextRobot implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        Robot robot =new Robot("super");
sce.getServletContext().setAttribute("robot", robot);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

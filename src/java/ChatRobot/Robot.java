/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChatRobot;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.servlet.ServletContext;
import org.alicebot.ab.Bot;
import org.alicebot.ab.Chat;
import org.alicebot.ab.History;
import org.alicebot.ab.MagicBooleans;
import org.alicebot.ab.MagicStrings;
import org.alicebot.ab.utils.IOUtils;

/**
 *
 * @author Lenovo
 */
public class Robot {
    private  final boolean TRACE_MODE = false;
    private String name;
    private Bot bot;
    private Chat chatSession;
    public Robot(String name) {
           this.name                 = name;
           
            String resourcesPath      = getClass().getClassLoader().getResource("resources/").getPath();
            MagicBooleans.trace_mode  = TRACE_MODE;
            this. bot                 = new Bot("super", resourcesPath);
            this. chatSession         = new Chat(bot);
            bot.brain.nodeStats();    }
    
    public String responseRobot(String textLine) {
        String response = null;
        if ((textLine == null) || (textLine.length() < 1)) {
            textLine = MagicStrings.null_input;
        }
        if (textLine.equals("q")) {
            System.exit(0);
        } else if (textLine.equals("wq")) {
            bot.writeQuit();
            System.exit(0);
        } else {
            String request = textLine;
            if (MagicBooleans.trace_mode) {
                System.out.println("STATE=" + request + ":THAT=" + ((History) chatSession.thatHistory.get(0)).get(0) + ":TOPIC=" + chatSession.predicates.get("topic"));
            }
            response = chatSession.multisentenceRespond(request);
            while (response.contains("&amp;lt;")) {
                response = response.replace("&amp;lt;", "&lt;");
            }
            while (response.contains("&amp;gt;")) {
                response = response.replace("&amp;gt;", "&gt;");
            }
        }
        return response;

    }

    

}

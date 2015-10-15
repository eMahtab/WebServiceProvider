package ch04.team;

import javax.xml.ws.Endpoint;

class TeamsPublisher {
    public static void main(String[ ] args) {
	int port = 9876;
	String url = "http://localhost:" + port + "/teams";
	System.out.println("Restfully publishing as teams on port " + port);
	Endpoint.publish(url, new RestfulTeams());
    	
    	/* String cwd = System.getProperty ("user.dir");
 	    String sep = System.getProperty ("file.separator");
 	    String path = 		cwd + sep ;
 	    
 	    System.out.println("Path : "+path);*/
    	
    	
    }
}

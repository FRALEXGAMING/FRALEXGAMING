
package at.fralexgaming;

import com.jcraft.jsch.*;

public class SSHConnect {
	
	public static void main(String user, String hostname, String password, String command){
	
	JSch jsch = new JSch();

	try
	{
		//connection
	  Session session = jsch.getSession(user, hostname, 22);
	  session.setConfig("StrictHostKeyChecking", "no");
	  session.setPassword(password);
	  session.connect();

	  
	  Channel channel = session.openChannel("exec");
	  ((ChannelExec) channel).setCommand(command);
	  channel.setInputStream(null);
	  ((ChannelExec) channel).setErrStream(System.err);

	  channel.connect();

	  channel.disconnect();
	  session.disconnect();
	}
	catch (Exception e)
	{
	  System.out.println(e.getMessage());
	}
	}

	
}
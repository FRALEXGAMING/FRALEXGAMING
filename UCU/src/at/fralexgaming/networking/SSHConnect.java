package at.fralexgaming.networking;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

public class SSHConnect {

	/*
	 * this class sets the connection to the ssh server up it uses the variables
	 * user hostname password and command user = the user you want connect to
	 * hostname = the host you want connect to password = the password from the
	 * user command = the line in the console you want to execute
	 */
	public static void main(String user, String hostname, String password, String command) {

		JSch jsch = new JSch();

		try {
			// connection
			Session session = jsch.getSession(user, hostname, 22);
			session.setConfig("StrictHostKeyChecking", "no");
			session.setPassword(password);
			session.connect();
			// execute command
			Channel channel = session.openChannel("exec");
			((ChannelExec) channel).setCommand(command);

			channel.connect();
			// disconnect
			channel.disconnect();
			session.disconnect();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
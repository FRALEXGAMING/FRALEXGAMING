package at.fralexgaming;

import java.io.InputStream;
import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

public class SSHConnect {
	Session session = null;
	Channel channel = null;
	String host = "";
	String user = "";
	String password = "";
	String command = "" ;
	JSch jsch = null;
	java.util.Properties config = null;

	SSHConnect(String command) {
		this.host = "10.0.0.12";
		this.user = "pi";
		this.password = "root";
		this.command = command;
	}

	public Channel initializeSession() {
		try {
			config = new java.util.Properties();
			config.put("StrictHostKeyChecking", "no");
			jsch = new JSch();
			session = jsch.getSession(user, host, 22);
			session.setPassword(password);
			session.setConfig(config);
			session.connect();
			System.out.println("Session Connected...");
			return session.openChannel("exec");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public  void executeCommand(String command) {
		try {
			channel = initializeSession();
			if (channel != null) {
				System.out.println("<<<<<<<<not null>>>>>>>>>>");
				((ChannelExec) channel).setCommand(command);
				channel.setInputStream(null);
				((ChannelExec) channel).setErrStream(System.err);
				InputStream in = channel.getInputStream();
				channel.connect();
				readServerOutput(channel, in);
				in.close();
				channel.disconnect();
				session.disconnect();
				System.out.println("DONE");
				// System.exit(0);
			} else {
				System.out.println("Error occured...");
				System.exit(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	

	public void readServerOutput(Channel channel, InputStream in) {
		byte[] tmp = new byte[1024];
		try {
			while (true) {
				while (in.available() > 0) {
					int i = in.read(tmp, 0, 1024);
					if (i < 0) {
						break;
					}
					System.out.print(new String(tmp, 0, i));
				}
				if (channel.isClosed()) {
					System.out.println("exit-status: " + channel.getExitStatus());
					break;
				}
				try {
					Thread.sleep(1000);
				} catch (Exception ee) {

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String command) {
		SSHConnect sce = new SSHConnect(command);
		sce.executeCommand(command);
	}
}
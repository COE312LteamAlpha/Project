package proj1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class TCP_C implements Runnable {
	
	// ip address of the machine 
    String host = "192.168.0.131";
    JSONParser parser = new JSONParser();
    // need the port 
    int port = 8080;
     String movement;  boolean spell=false;
     BattleDuo bD;
	TCP_C(String host, int port,BattleDuo bD){
			
		this.host = host;
		this.port = port;
		this.bD = bD;
		// make this a thread
		Thread t = new Thread(this);
		t.start();
	}

	
	public void run() {
		try {
		Socket socket = new Socket(this.host, this.port);
		InputStream input = socket.getInputStream();
		InputStreamReader reader = new InputStreamReader(input);
		// -------------------------------- new reader -------------------------------
		BufferedReader br = new BufferedReader(reader);
		String line = "";
		
		while ((line = br.readLine()) != null) {//read line by line
			//System.out.println(line);
		JSONObject jsonObject = (JSONObject) parser.parse(line);
		
		Scanner scan = new Scanner(System.in);
		String comm = null;
		comm = scan.nextLine();
		
		double Xval = Double.parseDouble(jsonObject.get("accelerometerAccelerationX").toString()); 
		double Yval = Double.parseDouble(jsonObject.get("accelerometerAccelerationY").toString());
		double Zval = Double.parseDouble(jsonObject.get("accelerometerAccelerationZ").toString());
		double Aval = Double.parseDouble(jsonObject.get("avAudioRecorderPeakPower").toString());
		
		
		if(Xval>0.5) {
			movement="right";
			System.out.println("r");
		}
		else if(Xval<-0.5) {
			movement="left";
			System.out.println("l");
		}
		else if(Zval< -0.5) {
			movement = "front";
			System.out.println("f");
		}
		else if(Zval > 0.5) {
			movement = "back";
			System.out.println("a");
		}
		if(Aval > -2) {
			spell=true;
			bD.spellAttack();
			System.out.println("a");
			Thread.sleep(10000);
		}
		
		
		}
		//----------------------------------------------------------------------------
		} catch (UnknownHostException ex) {
		System.out.println("Server not found: " + ex.getMessage());
		} catch (IOException ex) {
		System.out.println("I/O error: " + ex.getMessage());
		} catch (Exception e) {
		e.printStackTrace();
		}
		}
		
}

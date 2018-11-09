
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JTextArea;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class ChangeColorThread extends Thread {
	
	JTextArea txtArea;
	ArrayList<Integer> color;
	boolean isRun;
	
	public ChangeColorThread(JTextArea txtArea, ArrayList<Integer> color) {
		this.txtArea = txtArea;
		isRun = false;
		this.color = color;
	}

	public void setColor(ArrayList<Integer> color) {
		this.color = color;
	}

	public void stop_(){
		this.isRun = false;
	}
	
	public void execute(){
		this.isRun = true;
	}
	
	int index = 0;
	private int getNextColor() {
		if(this.color.size() == 0){
			return -1;
		}
		if(index >= this.color.size()){
			index = 0;
		}
		
		int r = index;
		index++;
	
		System.out.println(index);
		return this.color.get(r);
	}
	
	@Override
	public void run() {
		try {
			while(true){
				if(isRun){
					int indexColor = getNextColor();
					
					if(indexColor == 1){
						this.txtArea.setForeground(Color.red);
					} else if (indexColor == 2){
						this.txtArea.setForeground(Color.green);
					} else if (indexColor == 3){
						this.txtArea.setForeground(Color.blue);
					} else if (indexColor == 4){
						this.txtArea.setForeground(Color.yellow);
					}
				}
				
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	
	
	
}

package com.test.one;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

	public void toAFile() {

		try {
			Input input1 = new Input();
			String name = input1.readUserName();
			String itemList[] = input1.NumberOfItemsToBuy();
			int[] prirority = input1.provideThePriority(itemList);

			File file = new File("filename.txt");

			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);

			bw.write("S.No Name priority.");
			bw.write("\n");
			bw.write("====================");
			bw.write("\n");
			for (int i = 0; i < prirority.length; i++) {
				bw.write(" " + i + "\t");
				bw.write(" " + itemList[i] + "\t");
				bw.write(" " + prirority[i]);
				bw.write("\n");
			}

			bw.close();

			System.out.println("Done");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

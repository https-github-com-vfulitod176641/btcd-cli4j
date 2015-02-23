package temp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import com.neemre.btcdcli4j.jsonrpc.JsonParser;
import com.neemre.btcdcli4j.util.CollectionUtils;

public class IncubatorMain {
	
	public static void main(String[] args) {
		JsonParser parser = new JsonParser();
		System.out.println(parser.parseString("\"nul\"\""));
		
		String id = UUID.randomUUID().toString().replaceAll("-", "");
		System.out.printf("Unique ID: '%s'\n", id);
		
		List<String> listA = new ArrayList<String>();
		listA.add("listA: I like bitcoin");
		listA.add("listA: I like litecoin");
		listA.add("listA: I like dogecoin");
		List<String> listB = new ArrayList<String>();
		listB.add("listB: I like bitcoin");
		listB.add("listB: I like litecoin");
		listB.add("listB: I like dogecoin");
		List<String> listC = new ArrayList<String>();
		listC.add("listC: I like bitcoin");
		listC.add("listC: I like litecoin");
		listC.add("listC: I like dogecoin");
		List<String> listD = new ArrayList<String>();
		listD.add("listD: I like bitcoin");
		listD.add("listD: I like litecoin");
		listD.add("listD: I like dogecoin");

		System.out.printf("CollectionUtils.equalsSize(..) result is: '%s'\n", 
				CollectionUtils.equalsSize(listA, listB, listC, listD, null));
		System.out.printf("CollectionUtils.mergeInterlaced(..) result is: '%s'\n",
				CollectionUtils.mergeInterlaced(listA, listB, listC, listD));
		
		String[] arrayA = new String[3];
		arrayA[0] = "Hey, (A)";
		arrayA[1] = "what's (A)";
		arrayA[2] = "up? (A)";
		String[] arrayB = new String[3];
		arrayB[0] = "Hey, (B)";
		arrayB[1] = "what's (B)";
		arrayB[2] = "up? (B)";
		System.out.println(CollectionUtils.mergeInterlaced(Arrays.asList(arrayA), Arrays.asList(arrayB)));
	}
}
//package Interviews;
//
//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Map;
//import java.util.Map.Entry;
//import java.util.Set;
//import java.util.stream.Collectors;
//
//public class Example8 {
//	public static void main(String[] args) {
//		List<Integer> asList = Arrays.asList(2, 3, 5, -7, 5, 3, 5, -7);
//		long dup = findDup(asList);
//		System.out.println(dup);
//	}
//
//	public static Long findDup(List<Integer> list) {
//		// Set<Integer> s = new HashSet<>();
//		long count = 0;
//		list.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()))
//				.entrySet();
//				
//			//	stream().
//				//.filter(x -> x.getValue() > 1).collect(Collectors.toList());
//
//		return 0;
//
//	}
//}
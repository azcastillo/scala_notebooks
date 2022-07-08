//@main def m(args: String*) = 
//	args.foreach(arg => println(arg))

// or type it this way: 
// @main def m(args: String*) = 
// 	args.foreach((arg: String) => println(arg))

@main def m(ints: Int*) = 
	ints.foreach((int : Int) => println(int+1))
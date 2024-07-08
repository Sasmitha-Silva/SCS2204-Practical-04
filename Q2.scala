def main(args: Array[String]): Unit = { // Assume that the Integer is Given as a Command Line Arg
  if (args.length != 1) println("Please Input Only One Number")
  else {
    val input = args(0).toInt
    input match {
      case x if x <= 0     => println("Input Number is Negative/Zero")
      case x if x % 2 == 0 => println("Input Number is Even")
      case x if x % 2 == 1 => println("Input Number is Odd")
    }
  }
}

// Method 02

// You can get the integer as a user input by using readLine()
// import scala.io.StdIn.readLine
// var n = readLine().toInt

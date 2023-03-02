import scala.io.StdIn.readLine;
import scala.io.StdIn.readInt;
object StudentData{
def main(args:Array[String])=
{
	var marks:Int= readInt()
	for( i <- 1 to 6)
	{
		marks +=readLine
	}
	val percentage = (marks)/6;
println(" percentage is " +percentage)
}
}
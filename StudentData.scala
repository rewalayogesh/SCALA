object StudentData{
def main(args:Array[String])=
{
	var name = args(0)
	var one = args(1).toInt
	var two = args(2).toInt
	var three = args(3).toInt
	var four = args(4).toInt
	var five = args(5).toInt
	var six = args(6).toInt
	val percentage = (one+two+three+four+five+six)/6;
println(name +" percentage is " +percentage)
}
}
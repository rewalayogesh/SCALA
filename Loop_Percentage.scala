object StudentData{
def main(args:Array[String])=
{
	var name = args(0)
	var ans =0
	for( i <- 1 to 6)
	{
		ans +=args(i).toInt
		
	}
	
	val percentage = (ans)/6;
println(percentage)
}
}
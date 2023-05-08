object scalafunsort{
def main(args:Array[String]):Unit={
	val l= List (4,-8,2,99,78)
	println(l)
	println("Sorted using functional style\n")
	print(sort(l))
		
		}
	def sort(l:List[Int]):List[Int] = {
	if (l.length<=1) l
	else {
		val pivot  = l(l.length/2)
		sort (l.filter(_<pivot)):::
		l.filter(_==pivot):::
		sort(l.filter(_>pivot))
		}
		}
	
		}

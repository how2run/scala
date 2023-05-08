import scala.io.Source
import scala.collection.mutable.ArrayBuffer
object obj{
def main(args:Array[String]):Unit={
var numarray=new ArrayBuffer[Int]()
print("enter the number of elements:")
var n= scala.io.StdIn.readInt()
printf("enter the elements")
for(i<-0 until n)
numarray+= scala.io.StdIn.readInt()
println(numarray)
val t=minmax(numarray)
printf("max is %d\n",t._1)
printf("min is %d\n",t._2)
}
def minmax(numarray:ArrayBuffer[Int]):(Int,Int)={
var max:Int=numarray(0)
var min:Int=numarray(0)
for(i<-numarray){
if(i>min)
max=i
else if(i<min)
min=i
}
(max,min)

}
}

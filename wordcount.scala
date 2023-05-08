import scala.io.Source
object sc{
def main(args:Array[String]):Unit={
{
val filename="words.txt"
val wordcount=scala.collection.mutable.Map[String,Int]()
for(line<-Source.fromFile(filename).getLines){
for(word<-line.split(" "))
{
wordcount(word)=if(wordcount.contains(word)) wordcount(word)+1 else 1
}
}
println(wordcount)
}
}
}

abstract class Notification
case class sms(mobile:String,msg:String) extends Notification
case class email(emailaddr:String,subject:String,body:String) extends Notification
 
object smsnotification{
	def showNotification(notification:Notification):String=
	{
	notification match{
	 case email(emailaddr,subject,_)=>
	 s"you got an email from $emailaddr with message $subject"
	 case sms(mobile,msg)=>
	 s"you got an sms from $mobile with message $msg"
	 }
	 }
	 
	 def main (args:Array[String]) :Unit = {
	 val Sms = sms("1234567" ,"Hi")
	 val Email = email ("keerthi@gmail.com","change of elective", " Request change of elective from AWP to Unix")
	 println(showNotification(Sms))
	 println(showNotification(Email))
	 }
	 }

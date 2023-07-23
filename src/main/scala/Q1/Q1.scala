package Q1
import scala.io.StdIn.readInt
import scala.io.StdIn.readLine

object Q1 {

  def Cipher(opt:Int):String={
    print("Enter the massage = ")
    val msg = readLine()
    print("Enter the key = ")
    val key = readInt();

    opt match {
      case 0 => encrypt(msg,key)
      case 1 => decrypt(msg,key)
      case _ => "Wrong input"
    }


  }

  def encrypt(str:String , key:Int):String={
    val len = (str.length)
    str.substring((len-key), len) + str.substring(0,(len-key))
  }

  def decrypt(str:String , key:Int):String={
    val len = (str.length)
    str.substring(key,len)+str.substring(0,key)
  }


  def main(args:Array[String]):Unit={
    print("Enter 0 if you want Encrypt a massage  \nEnter 1 if you want to Decrypt a massage = ")
    val opt = readInt()

    println("Output = " + Cipher(opt))
  }

}

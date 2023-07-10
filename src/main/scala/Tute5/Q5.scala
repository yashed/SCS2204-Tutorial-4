package Tute5

object Q5 {

  def Addition(num:Int):Int={
    if(num <= 0){
      0
    }
    else if(num%2 == 0){
      (num -2) + Addition(num-2)
    }
    else{
      2

    }
  }

}

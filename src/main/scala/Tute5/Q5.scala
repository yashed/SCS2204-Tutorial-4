package Tute5

object Q5 {
  def OddEven(num: Int): Boolean = {
    if (num == 0) {
      true
    }
    else if (num == 1) {
      false
    }
    else {
      OddEven(num / 2);
    }
  }

  def EvenSeq(num:Int):Int={
    if(num>0){
      //EvenSeq(num-1);
      0
    }
    else{
      if(OddEven(num)){
        0
      }
      else{ 9}
    }
  }


}

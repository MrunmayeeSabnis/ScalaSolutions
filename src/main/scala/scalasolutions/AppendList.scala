package scalasolutions

class AppendList {
 def append[A](list1: List[A], list2: List[A]): List[A] = list2 match {
   case Nil => list1
   case head :: Nil => list1 :+ head
   case head :: tail => append(list1 :+ head, tail)
 }
}

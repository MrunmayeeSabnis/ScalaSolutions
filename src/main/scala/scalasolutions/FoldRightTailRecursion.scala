package scalasolutions


class FoldRightTailRecursion {

  def foldRightWithTailRecursion[A, B](list: List[A], emptyListValue: B)(f: (A, B) => B): B = list match {
    case Nil => emptyListValue
    case head :: tail => f(head, foldRightWithTailRecursion(tail, emptyListValue)(f))
  }

}

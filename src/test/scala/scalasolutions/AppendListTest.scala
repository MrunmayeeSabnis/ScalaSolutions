package scalasolutions

import org.scalatest.{FunSpec, Matchers}

class AppendListTest extends FunSpec with Matchers{

  describe("Append list"){
    it("should append two lists"){
      println("Here")
      val appendList = new AppendList
      appendList.append(List(1,2,3), List(4,5,6)) should be(List(1,2,3,4,5,6))
    }
  }
}

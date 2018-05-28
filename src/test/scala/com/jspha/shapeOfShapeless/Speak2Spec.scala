package com.jspha.shapeOfShapeless

import com.jspha.shapeOfShapeless.Speak2._
import org.scalatest.{FunSpec, Matchers}
import shapeless.HNil

class Speak2Spec extends FunSpec with Matchers {

  describe("Speak version 2") {
    it("returns proper HNil values") {
      speak(HNil) shouldEqual HNil
    }
    it("handles singleton lists with ints") {
      speak(3 :: HNil) shouldEqual "3" :: HNil
    }
    it("handles singleton lists with non-ints") {
      speak("foo" :: HNil) shouldEqual "foo" :: HNil
    }
  }

}

package com.allaboutscala.learn.scala.seven.days.day.four

/**
  * Created by Nadim Bahadoor on 15/10/2018.
  *
  * The content was inspired by the original tutorial below, and feedback from readers at http://allaboutscala.com.
  *
  * Tutorial: Learn How To Use Scala's Immutable TreeSet
  *
  * [[http://allaboutscala.com/tutorials/chapter-6-beginner-tutorial-using-scala-immutable-collection/scala-tutorial-learn-use-immutable-treeset/ Tutorial]]
  *
  *
  * Copyright 2016 - 2019 Nadim Bahadoor (http://allaboutscala.com)
  *
  * Licensed under the Apache License, Version 2.0 (the "License"); you may not
  * use this file except in compliance with the License. You may obtain a copy of
  * the License at
  *
  *  [http://www.apache.org/licenses/LICENSE-2.0]
  *
  * Unless required by applicable law or agreed to in writing, software
  * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
  * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
  * License for the specific language governing permissions and limitations under
  * the License.
  */
object Tutorial_12_Immutable_TreeSet extends App {

  import scala.collection.immutable.TreeSet
  println("Step 1: How to initialize a TreeSet with 3 elements")
  val treeSet1 = TreeSet("Plain Donut","Strawberry Donut","Chocolate Donut")
  println(s"Elements of treeSet1 = $treeSet1")



  println("\nStep 2: How to check specific elements in TreeSet")
  println(s"Element Plain Donut = ${treeSet1("Plain Donut")}")
  println(s"Element Strawberry Donut = ${treeSet1("Strawberry Donut")}")
  println(s"Element Chocolate Donut = ${treeSet1("Chocolate Donut")}")



  println("\nStep 3: How to add elements to TreeSet using +")
  val treeSet2 = treeSet1 + "Vanilla Donut" + "Vanilla Donut"
  println(s"Adding elements to TreeSet using + = $treeSet2")
  // NOTE: we only have one Vanilla Donut element and not two as sets are distinct



  println("\nStep 4: How to add two TreeSets together using ++")
  val treeSet3 = treeSet1 ++ TreeSet[String]("Vanilla Donut", "Glazed Donut")
  println(s"Add two TreeSets together using ++ = $treeSet3")



  println("\nStep 5: How to remove element in TreeSet using -")
  val treeSet4 = treeSet1 - "Plain Donut"
  println(s"TreeSet without Plain Donut element = $treeSet4")



  println("\nStep 6: How to find the intersection between two TreeSets using &")
  val treeSet5 = TreeSet("Vanilla Donut", "Glazed Donut", "Plain Donut")
  println(s"Intersection of treeSet1 and treeSet5 = ${treeSet1 & treeSet5}")



  println("\nStep 7: How to find the difference between two TreeSets using &~")
  println(s"Difference of treeSet1 and treeSet5 = ${treeSet1 &~ treeSet5}")



  println("\nStep 8: How to change ordering of TreeSet to descending alphabet")
  object ReverseAlphabetOrdering extends Ordering[String] {
    def compare(key1: String, key2: String) = key2.compareTo(key1)
  }
  val treeSet6 = TreeSet("Plain Donut", "Strawberry Donut", "Chocolate Donut")(ReverseAlphabetOrdering)
  println(s"Elements of treeSet6 = $treeSet6")
  // NOTE: our elements are now printed in descending order first with Strawberry Donut, then Plain Donut and finally Chocolate Donut



  println("\nStep 9: How to initialize an empty TreeSet")
  val emptyTreeSet = TreeSet.empty[String]
  println(s"Empty TreeSet = $emptyTreeSet")
}

var item: Array[String] = Array("Item 01", "Item 02", "Item 03", "Item 04")
var qty: Array[Int] = Array(10, 5, 8, 3)

@main
def main(): Unit = {
  displayInventory()
  restockItem("Item 01", 15)
  sellItem("Item 02", 3)
  sellItem("Item 03", 10)
  sellItem("Item 06", 2)
  displayInventory()
}

def displayInventory(): Unit = {
  println("Current Stock in the Inventory:")
  item.foreach(i => println(s"$i: ${qty(item.indexOf(i))}"))
}

def restockItem(itemName: String, quantity: Int): Unit = {
  val i = item.indexOf(itemName)
  if (i >= 0) {
    qty(i) += quantity
    println(
      s"$quantity Units of \"$itemName\" Restocked. New Quantity: ${qty(i)}"
    )
  } else {
    println(s"Item \"$itemName\" Does Not Exist in the Inventory.")
  }
}

def sellItem(itemName: String, quantity: Int): Unit = {
  val i = item.indexOf(itemName)
  if (i >= 0) {
    if (qty(i) >= quantity) {
      qty(i) -= quantity
      println(
        s"$quantity Units of \"$itemName\" Sold. Remaining Quantity: ${qty(i)}"
      )
    } else {
      println(
        s"Not Enough Quantity of \"$itemName\" to Sell. Available Quantity: ${qty(i)}"
      )
    }
  } else {
    println(s"Item \"$itemName\" Does Not Exist in the Inventory.")
  }
}

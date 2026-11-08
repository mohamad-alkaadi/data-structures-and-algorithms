// Insert n into arr at the next open position.
// Length is the number of 'real' values in arr, and capacity
// is the size (aka memory allocated for the fixed size array).
const insertItem = (arr, n, realValues, arrayCapacity) => {
  if (realValues < arrayCapacity) {
    arr[realValues] = n
  } else {
    console.log("array is full")
  }
  return arr
}

// Remove from the last position in the array if the array
// is not empty (i.e. length is non-zero).
const removeLastItem = (arr, realValues) => {
  if (realValues > 0) {
    arr[realValues - 1] = undefined
  } else {
    console.log("array is empty")
  }
  return arr
}

// Insert n into index i after shifting elements to the right.
// Assuming i is a valid index and arr is not full.
const insertItemAtMiddle = (arr, n, index, realValues, arrayCapacity) => {
  if (realValues < arrayCapacity && index < realValues) {
    for (let i = realValues; i > index; i--) {
      arr[i] = arr[i - 1]
    }
    arr[index] = n
  } else {
    console.log("error inserting the number")
  }
  return arr
}
// Remove value at index i before shifting elements to the left.
// Assuming i is a valid index.
const removeItemAtMiddle = (arr, index, realValues) => {
  if (index < realValues && index >= 0) {
    for (let i = index; i < realValues; i++) {
      arr[i] = arr[i + 1]
    }
  } else {
    console.log("error! cant remove error from array")
  }
  return arr
}

let arrOne = new Array(4)

arrOne[0] = 1
arrOne[1] = 2
arrOne[2] = 3

// ----------const insertItem = (arr, n, realValues, arrayCapacity) => {----------
// arrOne = insertItem(arrOne, 10, 3, 4)
// console.log(arrOne)
// -----------------------------------

let arrTwo = new Array(4)

arrTwo[0] = 1
arrTwo[1] = 2
arrTwo[2] = 3
arrTwo[3] = 4

// ----------const removeLastItem = (arr, realValues) => {----------
// arrTwo = removeLastItem(arrTwo, 4)
// console.log(arrTwo)

// -----------------------------------
let arrThree = new Array(4)

arrThree[0] = 1
arrThree[1] = 2
arrThree[2] = 3

// ----------const insertItemAtMiddle = (arr, n, index, realValues, arrayCapacity) => {----------
// arrThree = insertItemAtMiddle(arrThree, 9, 2, 3, 4)
// console.log(arrThree)

// -----------------------------------
let arrFour = new Array(4)

arrFour[0] = 1
arrFour[1] = 2
arrFour[2] = 3
arrFour[3] = 4

// ----------const removeItemAtMiddle = (arr, index, realValues) => {----------
// arrFour = removeItemAtMiddle(arrFour, 2, 4)
// console.log(arrFour)

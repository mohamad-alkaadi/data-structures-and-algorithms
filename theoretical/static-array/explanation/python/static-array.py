#  Insert n into arr at the next open position.
#  Length is the number of 'real' values in arr, and capacity
#  is the size (aka memory allocated for the fixed size array).

def insertToEnd(arr, n, realValuesLength, arrayCapacity):
    if(realValuesLength< arrayCapacity):
        arr[realValuesLength] = n
        return arr
    else:
        print("error! unable to add value, array at full capacity")
        return arr

#  Remove from the last position in the array if the array
#  is not empty (i.e. length is non-zero).

def removeFromEnd(arr, realValuesLength):
    if(realValuesLength>0):
        arr[realValuesLength -1] = 0
        return arr
    else:
        print("error! array is empty")
        return arr

# Insert n into index i after shifting elements to the right.
# Assuming i is a valid index and arr is not full.
def insertAtMiddle (arr, n, index, realValuesLength, arrayCapacity):
    if(realValuesLength< arrayCapacity and index <realValuesLength):
        for i in range(realValuesLength, index, -1):
            arr[i] = arr[i -1]
        arr[index] = n
    else:
        print("error, cant insert element")

    return arr

# Remove value at index i before shifting elements to the left.
# Assuming i is a valid index.
def removeInMiddle(arr, index, realValuesLength):
    if(realValuesLength>0):
        # it will increment by default
        for i in range(index, realValuesLength -1):
            arr[i] = arr[i+1]
        arr[realValuesLength - 1] = 0
    else:
        print("Error! array is empty")
    return arr


# arrExampleOne = [0] * 4
# arrExampleOne[0]=1
# arrExampleOne[1]=2
# arrExampleOne[2]=3

# # def insertToEnd(arr, n, realValuesLength, arrayCapacity):

# arrExampleOne = insertToEnd(arrExampleOne,5,3,4)
# print(arrExampleOne)


# ----------------------------------
# arrExampleTwo = [0] * 4
# arrExampleTwo[0]=1
# arrExampleTwo[1]=2
# arrExampleTwo[2]=3
# arrExampleTwo[3]=4

# # def removeFromEnd(arr, realValuesLength):

# arrExampleTwo = removeFromEnd(arrExampleTwo,4)
# print(arrExampleTwo)
# ------------------------------------
# arrExampleThree = [0] * 4
# arrExampleThree[0]=1
# arrExampleThree[1]=2
# arrExampleThree[2]=3

# # def insertInMiddle (arr, n, index, realValuesLength, arrayCapacity):

# arrExampleThree = insertAtMiddle(arrExampleThree,9,2,3,4)
# print(arrExampleThree)
# -----------------------------------
arrExampleFour = [0] * 4
arrExampleFour[0]=1
arrExampleFour[1]=2
arrExampleFour[2]=3
arrExampleFour[3]=4

# # def removeInMiddle(arr, index, realValuesLength):

arrExampleFour = removeInMiddle(arrExampleFour,1,4)
print(arrExampleFour)
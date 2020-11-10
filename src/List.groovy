def l1 = []
println l1

// + - += -+
def l2 = l1 + 11
println l2

println l2.isEmpty()    //false

println l2.add(12)   //true

l2.add(12)

println l2
println l2.unique()

def l3 = [1,4,3,2,4,2,45,5,3,25,6]

println l3.reverse()

def l4 = l3.unique().sort()

println l4.each{ it}

println l4.count{it}

println l4.sum()

println l4.remove(6)

println l4

// List contains number string and other type is ok

def L5 = [1,"hello",'ddd']
assert L5[1] == "hello"

for (l in L5){
    println l
}




//Learn Map
//2020-11-10
//Sometimes called dictionaries or associative arrays in other languages, Groovy features maps.
// M associate keys to values, separating keys and values with colons, and each key/value pairs with commas, and the whole keys and values surrounded by square brackets.

def colorMap =[red: '#00FFF0',green:'#00FF00',blue:'#00FFF0']

assert colorMap.red == '#00FFF0'

assert colorMap['red'] == '#00FFF0'

//one = is fu zhi
colorMap['pink'] = '#000FFF'

//redefine the value of colorMap.pink
colorMap.pink = '#0000FF'

assert colorMap.pink == '#0000FF'

// java.util.LinkedHashMap
assert colorMap instanceof LinkedHashMap

assert colorMap.abd == null

//In the example above, we used string keys, but you can also use values of other types as keys





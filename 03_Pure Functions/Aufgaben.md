### Aufagbe 1
| Aufgabe | Nur ein Rückgabewert | Resultat nur Abhängig von übergebenen Parametern | Verändert keine existierenden Werte | pure oder impure |
|---------|-----------------------|--------------------------------------------------|--------------------------------------|------------------|
| 1.1     | Ja                    | Nein                                             | Ja                                   | impure           |
| 1.2     | Ja                    | Ja                                               | Ja                                   | pure             |
| 1.3     | Ja                    | Ja                                               | Ja                                   | pure             |
| 1.4     | Ja                    | Nein                                             | Ja                                   | impure           |
| 1.5     | Ja                    | Ja                                               | Ja                                   | pure             |
| 1.6     | Ja                    | Ja                                               | Ja                                 | pure           |

### Aufagbe 2
function addToCart(cartItems, item) {
    // Create a new array with the item added
    const newCartItems = [...cartItems, item];
    return newCartItems;
}

let cartItems = [];
cartItems = addToCart(cartItems, 'Apple');
console.log(cartItems);  // Output: ['Apple']
cartItems = addToCart(cartItems, 'Banana');
console.log(cartItems);  // Output: ['Apple', 'Banana']
cartItems = addToCart(cartItems, 'Orange');
console.log(cartItems);  // Output: ['Apple', 'Banana', 'Orange']

---
function multiplyWithRandom(number, randomValue) {
    return number * randomValue;
}

const randomValue1 = Math.random();
console.log(multiplyWithRandom(5, randomValue1)); 

const randomValue2 = Math.random();
console.log(multiplyWithRandom(10, randomValue2)); 


### Aufgabe 3
in IntelliJ gelöst
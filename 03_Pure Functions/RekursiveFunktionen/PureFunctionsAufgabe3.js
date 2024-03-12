//Aufagbe 3.1
function sumOfListElements(list) {
    if (list.length === 0) {
        return 0;
    } else {
        return list[0] + sumOfListElements(list.slice(1)); // Rekursiver Aufruf
    }
}


const numbers = [1, 2, 3, 4, 5];
console.log(sumOfListElements(numbers));

//Aufgabe 3.2

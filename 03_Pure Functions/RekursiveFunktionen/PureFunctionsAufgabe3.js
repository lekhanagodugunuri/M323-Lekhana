//Aufagbe 3.1
function summeVonListElements(list) {
    if (list.length === 0) {
        return 0;
    } else {
        return list[0] + summeVonListElements(list.slice(1)); // Rekursiv
    }
}


const numbers = [1, 2, 3, 4, 5];
console.log(summeVonListElements(numbers));

//Aufgabe 3.2
function mittelWertElementList(lst) {
    function sumList(lst) {
        if (lst.length === 0) return 0;
        return lst[0] + sumList(lst.slice(1));
    }
    function length(lst) {
        if (lst.length === 0) return 0;
        return 1 + length(lst.slice(1));
    }
    return sumList(lst) / length(lst);
}
const list = [1, 2, 3, 4, 5];
console.log(mittelWertElementList(list));

//Aufgabe 3.3
function sortierteStrings(lst) {
    if (lst.length <= 1) return lst;
    const pivot = lst[0];
    const smaller = lst.slice(1).filter(item => item < pivot);
    const greater = lst.slice(1).filter(item => item >= pivot);

    return sortierteStrings(smaller).concat([pivot], sortierteStrings(greater));
}
const unsortedList = ["banana", "apple", "orange", "grape"];
console.log(sortierteStrings(unsortedList));

//Aufgabe 3.4
function ObjekteSortieren(objects) {
    if (objects.length <= 1) return objects;
    const pivot = objects[0];
    const smaller = [];
    const greater = [];

    for (let i = 1; i < objects.length; i++) {
        const currentItem = objects[i];
        if (compareObjects(currentItem, pivot) < 0) {
            smaller.push(currentItem);
        } else {
            greater.push(currentItem);
        }
    }

    return ObjekteSortieren(smaller).concat([pivot], ObjekteSortieren(greater));
}
function compareObjects(obj1, obj2) {
    if (obj1.date !== obj2.date) {
        return obj1.date.localeCompare(obj2.date);
    }
    if (obj1.priority !== obj2.priority) {
        return obj1.priority - obj2.priority;
    }
    return obj1.title.localeCompare(obj2.title);
}

const objects = [
    { date: "2024-03-20", priority: 2, title: "Task B" },
    { date: "2024-03-20", priority: 1, title: "Task A" },
    { date: "2024-03-19", priority: 3, title: "Task C" }
];
const sortedObjects = ObjekteSortieren(objects);
console.log(sortedObjects);

// Aufgabe 3.5
function flattenTree(tree) {
    if (!tree) return [];
    if (!tree.children || tree.children.length === 0) {
        return [tree.value];
    }
    const result = [];
    for (const child of tree.children) {
        result.push(...flattenTree(child));
    }
    return result;
}
const exampleTree = {
    value: 1,
    children: [
        {
            value: 2,
            children: [
                { value: 3 },
                { value: 4 }
            ]
        },
        { value: 5 }
    ]
};
const flattened = flattenTree(exampleTree);
console.log(flattened);




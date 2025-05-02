// Function to check if a number is even
function isEven(num) {
    return num % 2 === 0;
}

// Loop through numbers 1 to 10 and log results
for (let i = 1; i <= 10; i++) {
    if (isEven(i)) {
        console.log(i + " is even");
    } else {
        console.log(i + " is odd");
    }
}

const express = require('express');
const app = express()

app.get('/nodejs', (req, res) => res.send('Hello Node.js'));

app.listen(5000, () => {
    console.log('My REST API running on port 5000!');
})
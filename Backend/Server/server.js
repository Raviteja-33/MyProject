const express = require('express')
const app = express()
const cors = require('cors')
app.use(cors('*'))
app.use(express.json())


const routerUser = require('./customers')


app.use('/customers', routerUser)


app.listen(4000, '0.0.0.0', ()=>{
    console.log('Server Started at 4000')
})
const express = require('express')
const router = express.Router()
const db = require('./db')
const utils = require('./utils')

router.get('/details', (request, response) => {
    const { cust_id, fname, lname, address, email, password, phone, role, security, zipcode } = request.body
  
    const query = `SELECT * FROM   customers`
  
    db.query(query, (error, result) => {
      response.send(utils.createResult(error, result))
    })
  })
  

module.exports = router
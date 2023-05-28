import React, { Component } from 'react';
import PropTypes from 'prop-types';
import "bootstrap/dist/css/bootstrap.min.css";
import Card from 'react-bootstrap/Card';

const SchoolDashboard =() =>{

    return(
        <div className='container'>
       
                <table>
                  <tr>  <th>قائمة الطلاب</th></tr>
                  <tr><th>name</th>
                  <th>gender</th>
                  <th>Age</th></tr>
                  <tr><td>Data must  be fetched</td></tr>
                </table>
          
        </div>
    )


}
export default SchoolDashboard;
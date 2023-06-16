import React, { Component } from 'react';
import PropTypes from 'prop-types';
import "./errstyle.css"


const Err =() =>{
  return(
  <>
    
    <div className="d-flex align-items-center justify-content-center vh-100" id='err' >
      <div id="center"><img src={require('../../images/kalemati-brand.png')} alt='kalemati brand' id="img"  /></div>
    <p className="display-6 fw-bold text-white">Sorry,Looks like that the page your looking for is not found</p>
    </div>
    
    </>
  );
}

export default Err;
import React, { Component } from 'react';
import PropTypes from 'prop-types';
import "./errstyle.css"
import { useRouteError } from "react-router-dom";



const Err =() =>{
  const error = useRouteError();
  console.error(error);
  return(
  <>
<div id="error-page">
      <h1>Oops!</h1>
      <p>Sorry, an unexpected error has occurred.</p>
      <p>
        <i>{error.statusText || error.message}</i>
      </p>
    </div>
    
    </>
  );
}

export default Err;
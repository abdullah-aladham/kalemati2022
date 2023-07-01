import React, { Component } from 'react';
import PropTypes from 'prop-types';
import "../css/kalemati.css";
import Header from '../SharedElements/Header';
import Footer from '../footer';
import { Card ,Button} from 'react-bootstrap';
//import "../css/kalemati.css";
import { Link } from 'react-router-dom';
import Container from 'react-bootstrap/Container';
import Row from 'react-bootstrap/Row';
import Col from 'react-bootstrap/Col';

const PackageView =() =>{
    return(
        <>
    <Header />
    <h2 style={{textAlign: 'center',color: '#F6B968'}}>package view</h2>
    
<Container>
    <Row>
        <Col>
     <Card className='Card'>
            <img src={require('../sample1.jpg')} alt='sample'/>
     </Card>
         </Col>
         <Col>
     <Card className='Card'>
            <img src={require('../sample1.jpg')} alt='sample'/>
            <p>lorem ipsum</p>
     </Card>
         </Col>
         <Col>
     <Card className='Card'>
            <img src={require('../sample1.jpg')} alt='sample'/>
     </Card>
         </Col>
    </Row>
    <Row>
    <Col>
     <Card className='Card'>
            <img src={require('../sample1.jpg')} alt='sample'/>
     </Card>
         </Col>
         <Col>
     <Card className='Card'>
            <img src={require('../sample1.jpg')} alt='sample'/>
            <p>lorem ipsum</p>
     </Card>
         </Col>
         <Col>
     <Card className='Card'>
            <img src={require('../sample1.jpg')} alt='sample'/>
     </Card>
         </Col>
    </Row>
</Container>
            
  
<Footer/>
</>
    );
}

export default PackageView;
import React, { Component } from 'react';
import Header from '../SharedElements/Header';
import Footer from '../footer';
import { Card ,Button} from 'react-bootstrap';
import "../css/kalemati.css";
import { Link } from 'react-router-dom';
import Container from 'react-bootstrap/Container';
import Row from 'react-bootstrap/Row';
import Col from 'react-bootstrap/Col';

const RecommendedPage = () => {
    return( 
       
        <>
        <Header />
        <h2>Recomended packages</h2>
    <Container>
        <Row>
            <Col>
         <Card className='Card'>
                <img src={require('../sample1.jpg')} alt='sample'/>
                <Button variant="primary"><Link to="/Pages/PackageView" className='Link'> Discover Cards</Link></Button>
         </Card>
             </Col>
             <Col>
         <Card className='Card'>
                <img src={require('../sample1.jpg')} alt='sample'/>
                <Button variant="primary"><Link to="./Pages/PackageView" className='Link'> Discover Cards</Link></Button>
         </Card>
             </Col>
             <Col>
         <Card className='Card'>
                <img src={require('../sample1.jpg')} alt='sample'/>
                <Button variant="primary"><Link to="./Pages/PackageView" className='Link'> Discover Cards</Link></Button>
         </Card>
             </Col>
        </Row>
        <Row></Row>
    </Container>
                
      
    <Footer/>
    </>
    );  
    }


export default RecommendedPage;
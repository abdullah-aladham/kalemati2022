import React from 'react';
// import Header from '../SharedElements/Header';
import Header from '../SharedElements/Header';
import Footer from '../footer';
import { Card ,Button} from 'react-bootstrap';
import "../css/kalemati.css";
import { Link } from 'react-router-dom';
import Container from 'react-bootstrap/Container';
import Row from 'react-bootstrap/Row';
import Col from 'react-bootstrap/Col';

//import Kalemati from '../kalemati';



    const KalematiPage = () =>{
return(
    <>
    <Header />
    <h2 style={{textAlign: 'center',color: '#F6B968'}}>My cards</h2>
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
)
    }


export default KalematiPage;
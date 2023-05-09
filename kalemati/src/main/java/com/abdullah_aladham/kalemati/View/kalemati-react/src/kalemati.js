import React from "react";
import Carousel from 'react-multi-carousel';
import 'react-multi-carousel/lib/styles.css';
import Button from 'react-bootstrap/Button';
import Card from 'react-bootstrap/Card';

  const Kalemati = () =>{
    const responsive = {
      superLargeDesktop: {
        // the naming can be any, depends on you.
        breakpoint: { max: 4000, min: 3000 },
        items: 5
      },
      desktop: {
        breakpoint: { max: 3000, min: 1024 },
        items: 3
      },
      tablet: {
        breakpoint: { max: 1024, min: 464 },
        items: 2
      },
      mobile: {
        breakpoint: { max: 464, min: 0 },
        items: 1
      }
    };
      return (
        
        <Carousel responsive={responsive}>
          <Card>
            <Card.Img variant="top" src="holder.js/100px180" ></Card.Img>
            <Card.Body>
              <Card.Title>
                Package1
              </Card.Title>
              <Card.Text>
          Package details
        </Card.Text>
        <Button variant="primary">More Details</Button>

            </Card.Body>
          </Card>
          <Card>
            <Card.Img variant="top" src="logo.svg" ></Card.Img>
            <Card.Body>
              <Card.Title>
                Package2
              </Card.Title>
              <Card.Text>
          Package details
        </Card.Text>
        <Button variant="primary">More Details</Button>

            </Card.Body>
          </Card>
          <Card>
            <Card.Img variant="top" src="holder.js/100px180" ></Card.Img>
            <Card.Body>
              <Card.Title>
                Package3
              </Card.Title>
              <Card.Text>
          Package details
        </Card.Text>
        <Button variant="primary">More Details</Button>

            </Card.Body>
          </Card>
          <Card>
            <Card.Img variant="top" src="holder.js/100px180" ></Card.Img>
            <Card.Body>
              <Card.Title>
                See more
              </Card.Title>
              <Card.Text>
          Package details
        </Card.Text>

            </Card.Body>
          </Card>
        </Carousel>
      );
   
  }
      


export default Kalemati;
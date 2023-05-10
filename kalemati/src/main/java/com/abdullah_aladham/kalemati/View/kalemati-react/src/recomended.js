import React from 'react';
import Carousel from 'react-multi-carousel';
import 'react-multi-carousel/lib/styles.css';
import Button from 'react-bootstrap/Button';
import Card from 'react-bootstrap/Card';

const Recomended = () => {
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
          <Card.Img variant="top" src="https://scontent.fjrs29-1.fna.fbcdn.net/v/t1.6435-9/146184312_237476974759366_3667864136352351994_n.png?_nc_cat=102&ccb=1-7&_nc_sid=8bfeb9&_nc_ohc=6g1zpltn-BMAX-X7CWv&_nc_ht=scontent.fjrs29-1.fna&oh=00_AfC6EFOG1_hG6yZWOX0EniSQdZlGDflDOUgVrZhzbmvgQw&oe=64837200" ></Card.Img>
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
          <Card.Img variant="top" src="https://scontent.fjrs29-1.fna.fbcdn.net/v/t1.6435-9/146184312_237476974759366_3667864136352351994_n.png?_nc_cat=102&ccb=1-7&_nc_sid=8bfeb9&_nc_ohc=6g1zpltn-BMAX-X7CWv&_nc_ht=scontent.fjrs29-1.fna&oh=00_AfC6EFOG1_hG6yZWOX0EniSQdZlGDflDOUgVrZhzbmvgQw&oe=64837200" ></Card.Img>
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
          <Card.Img variant="top" src="https://scontent.fjrs29-1.fna.fbcdn.net/v/t1.6435-9/146184312_237476974759366_3667864136352351994_n.png?_nc_cat=102&ccb=1-7&_nc_sid=8bfeb9&_nc_ohc=6g1zpltn-BMAX-X7CWv&_nc_ht=scontent.fjrs29-1.fna&oh=00_AfC6EFOG1_hG6yZWOX0EniSQdZlGDflDOUgVrZhzbmvgQw&oe=64837200" ></Card.Img>
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
 
};

export default Recomended;
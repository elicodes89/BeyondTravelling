import React , { useState } from 'react';
import HotelDetail from './HotelDetail';
import Button from 'react-bootstrap/Button';
import ReactPlayer from 'react-player';
import { Card, Row, Ratio } from 'react-bootstrap';


const HotelList = ({regions}) => {
  const [selectedRegion, setSelectedRegion] = useState(null);

      const regionsItems = regions.map((region, index) => {
        return <Button variant="light" onClick = {() => onRegionClick(region) }><img src= {region.img} alt= "" width = "200px" /></Button>
  
    })

        const onRegionClick = function(region){
        setSelectedRegion(region);
    }
    
  
  if (selectedRegion) {
    return (
      <>
      <div>
      <ul>
        <HotelDetail region={selectedRegion}/>
      </ul>
    </div>
      </>
    
    )

  } else if (!selectedRegion) {
    return (      
    <div>
    <ul>
    <h2>Please choose region</h2>
      {/* <h1>Hello from BSL hotel list</h1> */}
      {regionsItems}
    </ul>
    <Card.Body>
      <div className='intro_video' style={{width: 700, height: 'auto'}}>
        <Ratio aspectRatio="16x9">
          <ReactPlayer
          url={"https://www.youtube.com/watch?v=swyWGfjBbAA"}
          controls={true}/>
          </Ratio>
          </div>
    </Card.Body>
  </div>
  
    )}
};

export default HotelList;
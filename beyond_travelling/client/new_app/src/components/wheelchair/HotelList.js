import React , { useState } from 'react';
import HotelDetail from './HotelDetail';
import Button from 'react-bootstrap/Button';

const HotelList = ({regions}) => {
  const [selectedRegion, setSelectedRegion] = useState(null);


    const regionsItems = regions.map((region, index) => {
      return <Button variant="light" onClick = {() => onRegionClick(region) }><img src= {region.img} alt= "regionimages" width = "330px" height = "320px" /></Button>

    })

        const onRegionClick = function(region){
        setSelectedRegion(region);
    }

    const onBackButton = function () {
      setSelectedRegion(null);
    }
    
  
  if (selectedRegion) {
    return (
      
      <div>
      <ul>
      <h3>Where would you like to go?</h3>
        <HotelDetail region={selectedRegion}/>
        <button Class = "button_2" onClick={() => onBackButton()}>Choose another Region</button>
      </ul>
    </div>
    );

  } else if (!selectedRegion) {
    return (      
    <div>
    <ul>
      {regionsItems}
    </ul>
  </div>
  
    )}
};

export default HotelList;
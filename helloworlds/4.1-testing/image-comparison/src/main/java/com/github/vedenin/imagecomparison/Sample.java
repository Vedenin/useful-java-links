package com.github.vedenin.imagecomparison;



import com.github.romankh3.image.comparison.ImageComparison;
import com.github.romankh3.image.comparison.ImageComparisonUtil;
import com.github.romankh3.image.comparison.model.ComparisonResult;
import com.github.romankh3.image.comparison.model.ComparisonState;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Sample of the using Image-Comparison library.
 */
public class Sample {

    public static void main(String[] args) throws IOException, URISyntaxException {
        // load the images to be compared
        BufferedImage expectedImage = ImageComparisonUtil.readImageFromResources("expected.png");
        BufferedImage actualImage = ImageComparisonUtil.readImageFromResources("actual.png");

        // where to save the result (leave null if you want to see the result in the UI)
        File resultDestination = new File("result.png");

        //Create ImageComparison object for it.
        ImageComparison imageComparison = new ImageComparison(expectedImage, actualImage, resultDestination);

        //Can be used another constructor for it, without destination.
        new ImageComparison("expected.png", "actual.png");
        //or
        new ImageComparison(expectedImage, actualImage);

        //Also can be configured BEFORE comparing next properties:

        //Threshold - it's the max distance between non-equal pixels. By default it's 5.
        imageComparison.setThreshold(10);
        imageComparison.getThreshold();

        //RectangleListWidth - Width of the line that is drawn in the rectangle. By default it's 1.
        imageComparison.setRectangleLineWidth(5);
        imageComparison.getRectangleLineWidth();

        //Destination. Before comparing also can be added destination file for result image.
        imageComparison.setDestination(resultDestination);
        imageComparison.getDestination();

        //MaximalRectangleCount - It means that would get first x biggest rectangles for drawing.
        // by default all the rectangles would be drawn.
        imageComparison.setMaximalRectangleCount(10);
        imageComparison.getMaximalRectangleCount();

        //MinimalRectangleSize - The number of the minimal rectangle size. Count as (width x height).
        // by default it's 1.
        imageComparison.setMinimalRectangleSize(100);
        imageComparison.getMinimalRectangleSize();

        //After configuring the ImageComparison object, can be executed compare() method:
        ComparisonResult comparisonResult = imageComparison.compareImages();

        //Can be found ComparisonState.
        ComparisonState comparisonState = comparisonResult.getComparisonState();

        //And Result Image
        BufferedImage resultImage = comparisonResult.getResult();

        //Image can be saved after comparison, using ImageComparisonUtil.
        ImageComparisonUtil.saveImage(resultDestination, resultImage);
    }
}
